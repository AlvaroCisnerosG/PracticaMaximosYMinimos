package clases;



public class Minimos {

	int ent1;
	int ent2;
	int ent3;
	/**
	 * Metodo que te devuelve el minimo de dos enteros
	 * @param ent1
	 * @param ent2
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static int MinimoDe2EnterosPositivos(int ent1,int ent2)throws IllegalArgumentException {		
		if((ent1 >= 0)&&(ent2 >= 0)){
			if(ent1>ent2){
				return ent2;
			}else{
				return ent1;
			}
		}else {
			throw new IllegalArgumentException("Es menos de cero");	
	}
}
	/**
	 * Metodo que te devuelve el minimo de tres enteros
	 * @param ent1
	 * @param ent2
	 * @param ent3
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static int MinimoDe3EnterosPositivos(int ent1,int ent2, int ent3)throws IllegalArgumentException {
		int max = 0;
	if((ent1 >= 0)&&(ent2 >= 0)){
		if((ent1<ent2)&&(ent1<ent3)) {
			max = ent1;
			
		}else if((ent2<ent1)&&(ent2<ent3)) {
			max = ent2;
			
		}else if((ent3<ent1)&&(ent3<ent2)) {
			max = ent3;
			
		}
	}else {
		throw new IllegalArgumentException("Es menos de cero");	
	}
	return max;
}
	
	
}
