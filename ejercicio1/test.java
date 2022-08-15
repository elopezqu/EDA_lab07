public class test {

	public static void main(String[] args) {
		HashMap<String, Integer>map=new HashMap<>();
		map.put("clave1", 100);
		map.put("clave2", 120);
        map.put("clave3", 11);
        map.put("clave4", 9);
        map.put("clave5", 23);
        map.put("clave6", 14);
        System.out.println("Método toString()");
	    System.out.println(map);
        System.out.println("Método get()");
        System.out.println(map.get("clave4"));
        System.out.println(map.get("clave1"));
        System.out.println(map.get("clave6"));
	}

}