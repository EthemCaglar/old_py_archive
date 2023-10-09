package MaceraOyunu;

public class Snake extends Obstacle{
    public Snake(){
        super("Snake", 4, (int)(Math.random()*3)+3, 12);
    }
}
