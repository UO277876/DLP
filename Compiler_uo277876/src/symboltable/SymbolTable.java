package symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;
	public SymbolTable()  {
		this.table = new ArrayList<Map<String,Definition>>();
		table.add(new HashMap<String,Definition>());
	}

	public void set() {
		table.add(new HashMap<String,Definition>());
		scope++;
	}
	
	public void reset() {
		table.remove(scope);
		scope--;
	}
	
	public boolean insert(Definition definition) {
		if (find(definition.getName()) == null) {
			definition.setScope(scope);
			table.get(scope).put(definition.getName(), definition);
			return true;
		}

		return false;
	}
	
	public Definition find(String id) {
		for(int i=0; i < table.size(); i++){
			Definition definition = table.get(i).get(id);
			if(definition != null){
				return definition;
			}
		}

		return null;
	}

	public Definition findInCurrentScope(String id) {
		Definition definition = table.get(scope).get(id);
		if(definition != null) {
				return definition;
		}

		return null;
	}
}
