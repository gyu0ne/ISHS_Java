public class SingleThreadExample {
    private static void runTask(String name) {
        for (int i=1; i<=5; i++) {
            System.out.println(name + " 스레드 " + i);
            try {
                Thread.sleep(500); // 0.5초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // 시작 시간 기록

        runTask("첫 번째");
        runTask("두 번째");
        runTask("세 번째");

        long endTime = System.currentTimeMillis(); // 종료 시간 기록
        long duration = endTime - startTime;
        System.out.println("순차 처리 : " + duration + "ms");
    }
}
