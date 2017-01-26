//Since a square is a rectangle (mathematically speaking), we decided that Square be a subclass of Rectangle.
  //      We make overriding of setHeight() and setWidth() to set both dimensions (width and height) to the same value for that instances of Square remain valid.

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}