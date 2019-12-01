package fr.dauphine.ja.amrouchekarim.shapes;

public class Ring extends Circle {

	private int rayon_interne;

	public Ring(Point point, int rayon, int rayon_interne) {
		super(point, rayon);
		this.rayon_interne = rayon_interne;
	}

	@Override
	public boolean equals(Object obj) {
		Ring r = (Ring) obj;
		// TODO Auto-generated method stub
		return super.equals(obj) && this.rayon_interne == r.rayon_interne;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "rayon_interne est " + this.rayon_interne;
	}

}
