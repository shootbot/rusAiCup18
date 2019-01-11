
public class Ut {
	
	static double dist(Entity a, Entity b) {
		double dx = a.x - b.x;
		double dy = a.y - b.y;
		double dz = a.z - b.z;
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}
	
	static double dist(Vec3d a, Vec3d b) {
		double dx = a.x - b.x;
		double dy = a.y - b.y;
		double dz = a.z - b.z;
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}
	
	static double dist2d(Vec3d a, Vec3d b) {
		double dx = a.x - b.x;
		double dz = a.z - b.z;
		return Math.sqrt(dx * dx + dz * dz);
	}
	
}
