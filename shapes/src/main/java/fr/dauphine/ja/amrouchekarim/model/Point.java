package fr.dauphine.ja.amrouchekarim.model;

public class Point  {
	private int x, y;
	private static int number = 0;

	public static int getNumber() {
		return number;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.number++;
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
		this.number++;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("(" + this.x + "," + this.y + ")");
	}

	public boolean asSameAs(Point p) {
		return (this.x == p.x && this.y == p.y);
	}

	public void translate(int px, int py) {
		this.x = this.x + px;
		this.y = this.y + py;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point p = (Point) obj;
		return this.x == p.x && this.y == p.y;
	}

}
