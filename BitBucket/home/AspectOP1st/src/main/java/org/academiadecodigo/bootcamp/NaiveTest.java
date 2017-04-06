package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 28/03/17.
 */
public class NaiveTest {

    private NaiveBean naiveBean;

    public NaiveTest(NaiveBean naiveBean) {
        this.naiveBean = naiveBean;
    }

    public void test() {
        naiveBean.talk();
    }
}
