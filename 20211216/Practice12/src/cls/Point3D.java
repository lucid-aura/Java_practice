package cls;

public class Point3D {
	int x,y,z;
	public Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Point3D() {
		this(0,0,0);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (obj  instanceof Point3D && (Point3D) obj != null) {
			if (((Point3D)obj).x == this.x && ((Point3D)obj).y == this.y && ((Point3D)obj).z == this.z) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "["+this.x+","+this.y+","+this.z+"]";
	}
}
