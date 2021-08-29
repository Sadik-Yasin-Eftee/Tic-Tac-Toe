package sample;

public class RandomNumberGenerator {
    public int max = 8, min = 0;

    public int generateRandomNumber(){
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
