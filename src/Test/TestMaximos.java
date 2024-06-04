package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Maximos;
import clases.Minimos;

class TestMaximos {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	  void testMaximoDe2EnterosPositivos() {       
		int esperada=4;
		int obtenida=Maximos.MaximoDe2EnterosPositivos(3,4) ;
		assertEquals(esperada,obtenida);
  }
	@Test
	  void testMinimoDe2EnterosPositivos2() {       
		int esperada=3;
		int obtenida=Maximos.MaximoDe2EnterosPositivos(3,3) ;
		assertEquals(esperada,obtenida);
  }@Test
	  void testMaximoDe2EnterosPositivos3() {       
		int obtenida=Minimos.MinimoDe2EnterosPositivos(-3,4) ;
    }@Test
	  void testMaximoDe3EnterosPositivos() {       
		int esperada=4;
		int obtenida=Maximos.MaximoDe3EnterosPositivos(3,3,4) ;
		assertEquals(esperada,obtenida);
    }@Test
	  void testMaximoDe3EnterosPositivos2() {       
		int esperada=3;
		int obtenida=Maximos.MaximoDe3EnterosPositivos(3,3,3) ;
		assertEquals(esperada,obtenida);
}@Test
	  void testMaximoDe3EnterosPositivos3() {       
		int esperada=3;
		int obtenida=Maximos.MaximoDe3EnterosPositivos(4,3,3) ;
		assertEquals(esperada,obtenida);
}@Test
	  void testMaximoDe3EnterosPositivos4() {       
		int esperada=3;
		int obtenida=Maximos.MaximoDe3EnterosPositivos(-8,3,3) ;
		assertEquals(esperada,obtenida);
}
}
