package tracts2atl;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.tzi.use.main.Session;
import org.tzi.use.main.shell.NoSystemException;
import org.tzi.use.main.shell.Shell;
import org.tzi.use.runtime.impl.PluginRuntime;

 

public class ConstraintsTypeExtractor {
	
	public String[] exprs;
	public String pathUSEMM;
	
	public ConstraintsTypeExtractor(String[] exprs, String pathUSEMM){
		this.exprs = exprs;
		this.pathUSEMM = pathUSEMM;
	}

	public List<List<String>> getConstraintTypes() throws NoSystemException {
		
		List<List<String>> constraintTypes;
		
		Session session = new Session();
		PluginRuntime pr = new PluginRuntime();
		Shell shell = new Shell(session, pr);
		
		shell.cmdOpenUseFile(pathUSEMM);
		
		constraintTypes = new LinkedList<List<String>>(); 
		for (String c : exprs){
			Set<String> cTypes = new HashSet<String>();
			cTypes = shell.deriveStaticFeatures(c, true);
			List<String> cString = new LinkedList<String>();
			for(String t : cTypes){
				if (!t.equals("Integer") && !t.equals("Boolean") &&
						!t.equals("String") && !t.equals("OclVoid"))
				cString.add(t);
			}
			constraintTypes.add(cString);
		}
		return constraintTypes;
	}

}
