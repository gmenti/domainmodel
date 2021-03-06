/*
 * generated by Xtext 2.14.0
 */
package org.xtext.domainmodel.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.domainmodel.DomainModelRuntimeModule
import org.xtext.domainmodel.DomainModelStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DomainModelIdeSetup extends DomainModelStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DomainModelRuntimeModule, new DomainModelIdeModule))
	}
	
}
