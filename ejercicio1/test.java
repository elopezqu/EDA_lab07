public class test {

	public static void main(String[] args) {
		HashMap<String, Integer>map=new HashMap<>();
		map.put("clave1", 100);
		map.put("clave2", 120);
        map.put("clave3", 11);
        map.put("clave4", 9);
        map.put("clave5", 23);
        map.put("clave6", 14);
        System.out.println("Método size():");
        System.out.println(map.size());
        System.out.println("Método isEmpty():");
        System.out.println(map.isEmpty());
        System.out.println("Método hashCode():");
        System.out.println("de clave1: "+map.hashCode("clave1"));
        System.out.println("de clave5: "+map.hashCode("clave5"));
        System.out.println("de clave6: "+map.hashCode("clave6"));
        System.out.println("Método containsKey():");
        System.out.println("de clave1: "+map.containsKey("clave1"));
        System.out.println("de clave4: "+map.containsKey("clave4"));
        //De una clave que no está en el Hash
        System.out.println("de clave9: "+map.containsKey("clave9"));
        System.out.println("Método containsValue():");
        System.out.println("de 100: "+map.containsValue(100));
        System.out.println("de 120: "+map.containsValue(120));
        //De un valor que no está en el Hash
        System.out.println("de 39: "+map.containsValue(39));
        System.out.println("Método get()");
        System.out.println("de clave4: "+map.get("clave4"));
        System.out.println("de clave1: "+map.get("clave1"));
        System.out.println("de clave6: "+map.get("clave6"));
        System.out.println("Método toString():");
        System.out.println("Método remove()");
        System.out.println("de clave4: "+map.remove("clave4"));
        System.out.println("de clave1: "+map.remove("clave1"));
        System.out.println("de clave6: "+map.remove("clave6"));
        System.out.println("Método toString() después de las eliminaciones de clave4, clave1 y clave6:");
	    System.out.println(map);
        System.out.println("Método clear()");
        map.clear();
        System.out.println(map);
	}

}