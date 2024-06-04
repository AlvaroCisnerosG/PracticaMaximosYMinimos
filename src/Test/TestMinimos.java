package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Minimos;


class TestMinimos {
	

	static void enteros() {
	}
	@Test
	  void testMinimoDe2EnterosPositivos() {       
		int esperada=3;
		int obtenida=Minimos.MinimoDe2EnterosPositivos(3,4) ;
		assertEquals(esperada,obtenida);
    }
	@Test
	  void testMinimoDe2EnterosPositivos2() {       
		int esperada=3;
		int obtenida=Minimos.MinimoDe2EnterosPositivos(3,3) ;
		assertEquals(esperada,obtenida);
  }
	@Test
	  void testMinimoDe2EnterosPositivos3() {       
		int esperada=3;
		int obtenida=Minimos.MinimoDe2EnterosPositivos(-3,4) ;
		assertEquals(esperada,obtenida);
  }
	@Test
	  void testMinimoDe3EnterosPositivos() {       
		int esperada=3;
		int obtenida=Minimos.MinimoDe3EnterosPositivos(3,4,8) ;
		assertEquals(esperada,obtenida);
  }
	@Test
	  void testMinimoDe3EnterosPositivos2() {       
		int esperada=3;
		int obtenida=Minimos.MinimoDe3EnterosPositivos(3,3,3) ;
		assertEquals(esperada,obtenida);
}
	@Test
	  void testMinimoDe3EnterosPositivos3() {       
		int esperada=3;
		int obtenida=Minimos.MinimoDe3EnterosPositivos(8,3,4) ;
		assertEquals(esperada,obtenida);
}
	@Test
	  void testMinimoDe3EnterosPositivos4() {       
		int esperada=3;
		int obtenida=Minimos.MinimoDe3EnterosPositivos(-3,4,8) ;
		assertEquals(esperada,obtenida);
}

}
