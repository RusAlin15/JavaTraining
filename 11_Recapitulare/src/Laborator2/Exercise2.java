//
package Laborator2;

public class Exercise2 {
	public static void main(String[] args) {
		Parabola parabola1 = new Parabola(1, 3, 5);
		Parabola parabola2 = new Parabola(6, 3, 1);
		Parabola parabola3 = new Parabola(parabola1);

		Punct punct1;
		Punct punct2;

		parabola1.calculVarf();
		parabola2.calculVarf();
		parabola3.calculVarf();

		System.out.println(parabola1);
		System.out.println(parabola2);
		System.out.println(parabola3);

		punct1 = Parabola.getMijlocCoordonate(parabola1, parabola2);
		punct2 = Parabola.getMijlocCoordonate(parabola1, parabola3);

		System.out.println(punct1);
		System.out.println(punct2);
	}
}
