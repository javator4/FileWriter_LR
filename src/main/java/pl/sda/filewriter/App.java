package pl.sda.filewriter;

public class App
{
    static class Task1 implements Runnable{
        @Override
        public void run() {
            //FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
            SingletonEnum fileWriterSingleton = SingletonEnum.INSTANCE;
            System.out.println(fileWriterSingleton);
            fileWriterSingleton.write("Blabla","blublu.txt");
        }
    }
    static class Task2 implements Runnable{

        @Override
        public void run() {
            //FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
            SingletonEnum fileWriterSingleton = SingletonEnum.INSTANCE;
            System.out.println(fileWriterSingleton);
            fileWriterSingleton.write("Bleble","blublu.txt");

        }
    }
    static class Task3 implements Runnable{

        @Override
        public void run() {
            //FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
            SingletonEnum fileWriterSingleton = SingletonEnum.INSTANCE;
            System.out.println(fileWriterSingleton);
            fileWriterSingleton.write("Bribri","blublu.txt");

        }
    }
    static class Task4 implements Runnable{

        @Override
        public void run() {
            //FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
            SingletonEnum fileWriterSingleton = SingletonEnum.INSTANCE;
            System.out.println(fileWriterSingleton);
            fileWriterSingleton.write("Blaipblaip","blublu.txt");

        }
    }

    public static void main( String[] args )
    {
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());
        Thread thread3 = new Thread(new Task3());
        Thread thread4 = new Thread(new Task4());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        FileWriterSingleton.getInstance().write("Brrrrrr","blublu.txt");
    }
}
