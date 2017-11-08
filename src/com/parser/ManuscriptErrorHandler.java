package com.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNState;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.misc.IntervalSet;

import java.util.ArrayList;
import java.util.Arrays;

public class ManuscriptErrorHandler extends DefaultErrorStrategy {

    public ManuscriptErrorHandler(){
        super();
    }

    public void reset(Parser recognizer) {
        this.endErrorCondition(recognizer);
    }

    protected void beginErrorCondition(Parser recognizer) {
        this.errorRecoveryMode = true;
    }

    public boolean inErrorRecoveryMode(Parser recognizer) {
        return this.errorRecoveryMode;
    }

    protected void endErrorCondition(Parser recognizer) {
        this.errorRecoveryMode = false;
        this.lastErrorStates = null;
        this.lastErrorIndex = -1;
    }

    public void reportMatch(Parser recognizer) {
        this.endErrorCondition(recognizer);
    }

    public void reportError(Parser recognizer, RecognitionException e) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            if (e instanceof NoViableAltException) {
                this.reportNoViableAlternative(recognizer, (NoViableAltException)e);
            } else if (e instanceof InputMismatchException) {
                this.reportInputMismatch(recognizer, (InputMismatchException)e);
            } else if (e instanceof FailedPredicateException) {
                this.reportFailedPredicate(recognizer, (FailedPredicateException)e);
            } else {
                System.err.println("unknown recognition error type: " + e.getClass().getName());
                recognizer.notifyErrorListeners(e.getOffendingToken(), e.getMessage(), e);
            }

        }
    }

    public void recover(Parser recognizer, RecognitionException e) {
        if (this.lastErrorIndex == recognizer.getInputStream().index() && this.lastErrorStates != null && this.lastErrorStates.contains(recognizer.getState())) {
            recognizer.consume();
        }

        this.lastErrorIndex = recognizer.getInputStream().index();
        if (this.lastErrorStates == null) {
            this.lastErrorStates = new IntervalSet(new int[0]);
        }

        this.lastErrorStates.add(recognizer.getState());
        IntervalSet followSet = this.getErrorRecoverySet(recognizer);
        this.consumeUntil(recognizer, followSet);
    }

    public void sync(Parser recognizer) throws RecognitionException {
        ATNState s = (ATNState)((ParserATNSimulator)recognizer.getInterpreter()).atn.states.get(recognizer.getState());
        if (!this.inErrorRecoveryMode(recognizer)) {
            TokenStream tokens = recognizer.getInputStream();
            int la = tokens.LA(1);
            IntervalSet nextTokens = recognizer.getATN().nextTokens(s);
            if (!nextTokens.contains(-2) && !nextTokens.contains(la)) {
                switch(s.getStateType()) {
                    case 3:
                    case 4:
                    case 5:
                    case 10:
                        if (this.singleTokenDeletion(recognizer) != null) {
                            return;
                        }

                        throw new InputMismatchException(recognizer);
                    case 9:
                    case 11:
                        this.reportUnwantedToken(recognizer);
                        IntervalSet expecting = recognizer.getExpectedTokens();
                        IntervalSet whatFollowsLoopIterationOrRule = expecting.or(this.getErrorRecoverySet(recognizer));
                        this.consumeUntil(recognizer, whatFollowsLoopIterationOrRule);
                    case 6:
                    case 7:
                    case 8:
                    default:
                }
            }
        }
    }

    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        TokenStream tokens = recognizer.getInputStream();
        String input;
        if (tokens != null) {
            if (e.getStartToken().getType() == -1) {
                input = "<EOF>";
            } else {
                input = tokens.getText(e.getStartToken(), e.getOffendingToken());
            }
        } else {
            input = "<unknown input>";
        }

        String msg = "no viable alternative at input " + this.escapeWSAndQuote(input);
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
//        String msg = "mismatched input " + this.getTokenErrorDisplay(e.getOffendingToken()) + " expecting " + e.getExpectedTokens().toString(recognizer.getVocabulary());
//        String msg = "mismatched input " + this.getTokenErrorDisplay(e.getOffendingToken()) + " expecting " + recognizer.getRuleContext().toString(Arrays.asList(recognizer.getRuleNames())) ;
//        String msg = "mismatched input " + this.getTokenErrorDisplay(e.getOffendingToken()) + " expecting " + e.getCtx().toString(Arrays.asList(recognizer.getRuleNames()),e.getCtx().parent) ;
        String msg = "mismatched input " + this.getTokenErrorDisplay(e.getOffendingToken()) + " expecting " + Arrays.asList(recognizer.getRuleNames()).get(e.getCtx().getRuleIndex());

        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    protected void reportFailedPredicate(Parser recognizer, FailedPredicateException e) {
        String ruleName = recognizer.getRuleNames()[recognizer.getContext().getRuleIndex()];
        String msg = "rule " + ruleName + " " + e.getMessage();
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    protected void reportUnwantedToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
//            String msg = "extraneous input " + tokenName + " expecting " + expecting.toString(recognizer.getVocabulary());
            String msg = "extraneous input " + tokenName + " expecting " + recognizer.getVocabulary().getDisplayName(expecting.getMinElement());
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }

    protected void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "missing " + expecting.toString(recognizer.getVocabulary()) + " at " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }



}
