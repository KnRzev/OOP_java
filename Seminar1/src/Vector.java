public class Vector {
    private float x;
    private float y;
    private float z;

    public Vector(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float get_x(){
        return x;
    }

    public float get_y(){
        return y;
    }

    public float get_z(){
        return z;
    }

    public void set_x(float x){
        this.x =  x;
    }

    public void set_y(float y){
        this.y =  y;
    }

    public void set_z(float z){
        this.z =  z;
    }


    public void set_xyz(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector summa(Vector other){
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public float scalar(Vector other){
        return (this.x * other.x + this.y * other.y + this.z * this.z);
    }

    public Vector multik(int value){
        return new Vector(this.x * value, this.y * value, this.z * value);
    }

    public static void main(String[] args){
        Vector v1 = new Vector(2, 3, 4);
        Vector v2 = new Vector(11, -2, 0);
        Vector v3 = v1.summa(v2);
        float scal = v1.scalar(v2);
        Vector v5 = v2.multik(5);
        System.out.println(v3.x + " " + v3.y + " " + v3.z);
        System.out.println(scal);
        System.out.println(v5.x + " " + v5.y + " " + v5.z);
    }
}
