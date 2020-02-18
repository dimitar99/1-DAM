package vector3d;

import java.util.*;

public class vector1 {
	
	private int x;
	private int y;
	private int z;
	
	public void vector1() {
		
		this.x = 0;
		this.y = 0;
		this.z = 0;
		
	}
	
	public void setX(int x) {
		
		this.x = x;
		
	}
	
	public int getX() {
		
		return x;
		
	}
	
	public void setY(int y) {
		
		this.y = y;
		
	}
	
	public int getY() {
		
		return y;
		
	}
	
	public void setZ(int z) {
		
		this.z = z;
		
	}
	
	public int getZ() {
		
		return z;
		
	}
	
	public static void suma(vector1 v, vector1 v1, vector1 v2) {
		
		v2.setX(v.getX() + v1.getX());
		v2.setY(v.getY() + v1.getY());
		v2.setZ(v.getZ() + v1.getZ());
		
	}
	
	public static void resta(vector1 v, vector1 v1, vector1 v2) {
		
		v2.setX(v.getX() - v1.getX());
		v2.setY(v.getY() - v1.getY());
		v2.setZ(v.getZ() - v1.getZ());
		
	}
	
	public static void prod_escalar(vector1 v, vector1 v1, vector1 v2) {
		
		v2.setX(v.getX() * v1.getX());
		v2.setY(v.getY() * v1.getY());
		v2.setZ(v.getZ() * v1.getZ());
		
	}
	
	public static void longitud(vector1 v,vector1 v1) {
		
		v1.setX(v.getX()*v.getX());
		v1.setY(v.getY()*v.getY());
		v1.setZ(v.getZ()*v.getZ());
		
	}
	
}