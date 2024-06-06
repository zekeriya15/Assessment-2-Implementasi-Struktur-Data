public class PackageSchedule implements Comparable<PackageSchedule> {
    private int id;
    private String type;
    private String name;
    private int date;
    private String address;

    // constructor
    public PackageSchedule(int id, String type, String name, int date, String address) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public int duration() {
        switch (type) {
            case "biasa":
                return 4;
            case "express":
                return 3;
            case "kilat":
                return 2;
            case "same day" :
                return 1;
            default:
                return 0;
        }
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "idPelanggan: " + id + ", namaPelanggan: " + name + ", alamatPelanggan: " + address;
    }


    @Override
    public int compareTo(PackageSchedule other) {
        int result = this.duration() + this.date;
        int otherResult = other.duration() + other.date;

        if (result < otherResult) {
            return -1;
        } else if (result > otherResult) {
            return 1;
        } else {
            return 0;
        }
    }

    
    
    

}





