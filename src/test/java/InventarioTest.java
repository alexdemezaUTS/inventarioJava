import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class InventarioTest {
    @Test
    void calculaSubtotal() {
        assertEquals(201, inventario.calcularSubtotal(50, 4));
    }

    @Test
    void calculaSubtotalConCantidadCero() {
        assertEquals(0, inventario.calcularSubtotal(50, 0));
    }
}
