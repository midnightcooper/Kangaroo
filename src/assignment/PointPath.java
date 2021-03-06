package assignment;

public class PointPath {
    //testing123
    private String pathid;
    private Point p;
    private String source;
    private Integer obstacleheight;

    public PointPath(String source, Point p, String pathid) {
        this.source = source;
        this.p = p;
        this.pathid = pathid;
    }

    public PointPath(String source, Point p, String pathid, Integer obstacleheight) {
        this.source = source;
        this.p = p;
        this.pathid = pathid;
        this.obstacleheight = obstacleheight;
    }

    public Integer getObstacleheight() {
        return obstacleheight;
    }

    public void setObstacleheight(Integer obstacleheight) {
        this.obstacleheight = obstacleheight;
    }

    public String toString() {
        return "Source: " + source
                + "\nPoint: " + p.toString()
                + "\nPath ID: " + pathid.toString()
                + "\nObstacle Height: " + obstacleheight;
    }

    public String getPathid() {
        return pathid;
    }

    public void setPathid(String pathid) {
        this.pathid = pathid;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
