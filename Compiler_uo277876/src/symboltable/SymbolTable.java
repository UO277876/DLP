package symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;

	public SymbolTable()  {
		this.table = new ArrayList<>();
		table.add(new HashMap<String,Definition>());
	}

	public void set() {
		table.add(new HashMap<String,Definition>());
		scope++;
	}
	
	public void reset() {
		table.remove(scope--);
		//scope--;
	}
	
	public boolean insert(Definition definition) {
		Definition def = findInCurrentScope(definition.getName());
		if (def == null) {
			definition.setScope(scope);
			table.get(scope).put(definition.getName(), definition);
			return true;
		}

		return false;
	}
	
	public Definition find(String id) {
		//for(int i=0; i < table.size(); i++){
		for(int i = scope; i >= 0; i--){
			Definition def = table.get(i).get(id);
			if(def != null){
				return def;
			}
		}

		return null;
	}

	public Definition findInCurrentScope(String id) {
		Definition def = table.get(scope).get(id);
		if(def != null) {
				return def;
		}

		return null;
	}
}
