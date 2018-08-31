/*
 * generated by Xtext 2.14.0
 */
package org.xtext.domainmodel.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.domainmodel.parser.antlr.internal.InternalDomainModelParser;
import org.xtext.domainmodel.services.DomainModelGrammarAccess;

public class DomainModelParser extends AbstractAntlrParser {

	@Inject
	private DomainModelGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDomainModelParser createParser(XtextTokenStream stream) {
		return new InternalDomainModelParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public DomainModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomainModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}