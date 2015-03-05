package tracts2atl.test;
import org.tzi.use.main.shell.NoSystemException;

import tracts2atl.MatchingTablesBuilder_Old;


public class SM2LT {

	public static void main(String[] argv) throws Exception{

		String c0 = "StateMachine.allInstances->forAll(sm | sm.state->isUnique(name)) and StateMachine.allInstances->isUnique(name)";		
		
		String c1 = "StateMachine.allInstances->forAll (sm | " +
				"(sm.state->size() = 2) and (sm.transition->size() = 1) and	(sm.transition.src <> sm.transition.tgt))";
		
		String c2 = "LookUpTable.allInstances->size() = 1";
		
		String c3 = "StateMachine.allInstances->size() = LookUpTable.allInstances->size()" +
				" and " +
				"LookUpTable.allInstances->forAll( c | " +
				"	StateMachine.allInstances->one(sm | " +
				"		c.event.change->exists(ch | ch.sm = sm.name) and " +
				"		sm.transition.src->collect(name) = c.event.change->collect(ch | ch.fromState) and " +
				"		sm.transition.tgt-> collect(name) = c.event.change->collect(ch | ch.toState) and " +
				"		sm.transition.event = c.event.name))";
		
		String [] exprs = {c0, c1, c2, c3};
		int i = 1; for (String e: exprs){
			System.out.println("C"+i+": "+e);
			i++;
		}
		
		
	}	
}
