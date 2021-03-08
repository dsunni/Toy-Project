package hello.core.singletone;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletoneService {
    // static -> 클래스 레벨로 올라가기 때문에 딱 하나만 생성됨
    // 1. JVM이 뜰 때 자기 자신을 객체 인스턴스로 생성
    private static final SingletoneService instance = new SingletoneService();

    public static SingletoneService getInstance() {
        return instance;
    }

    private SingletoneService() {

    }
}
