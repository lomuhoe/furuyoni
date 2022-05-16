package debug;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import data.ActionCard;
import data.AttackCard;
import data.Card;
import data.ContinuingCard;
import data.Megami;

public class Save {
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private final String PATH = ".\\data\\MegamiAndCard.dat";

    List<Megami> megamiList;
    List<Megami> testList;

    public void setMegamiList() {
        megamiList = new ArrayList<>();
        megamiList.add(new Megami(100, "유리나", "[결사] - 당신의 라이프가 3이하일 경우, 몇몇 카드가 강화된다.", new Card[]{
            new AttackCard(101, "참", "-", -1, 0, 3, 4, 3, 1),
            new AttackCard(102, "일섬", "【상시】[결사]-당신의 라이프가 3이하라면, 이 공격은 +1/+0이 된다.", -1, 0, 3, 3, 2, 2),
            new AttackCard(103, "자루치기", "【공격후】[결사]-당신의 라이프가 3이하라면, 이 턴에 당신이 다음에 행하는 공격은 +1/+0이 된다.", -1, 0, 1, 2, 2, 1),
            new AttackCard(104, "거합", "【상시】현재 간격이 2이하라면, 이 공격은 -1/-1이 된다.", -1, 2, 2, 4, 4, 3),
            new ActionCard(105, "기백", "당신은 집중력을 1 얻는다. 이 턴 당신의 다음 다른 여신에 의한 비장패가 아닌 공격은 대응불가(통상패)와 거리확대(근1)을 얻는다.", -1, 0),
            new ContinuingCard(106, "압도", "[빈틈]【파기시】공격『적정거리1-4、3/-』을 행한다.", -1, 0, 2),
            new ContinuingCard(107, "기염만장", "【전개중】결사-당신의 라이프가 3이하라면, 당신의 다른 여신의 의한 공격은 +1/+1과 초극을 얻는다.", -1, 2, 4),
            new AttackCard(108, "달그림자 떨어지니", "-", 7, 0, 3, 4, 4, 4),
            new AttackCard(109, "해안에 파랑 일며", "[종단] [공격후] 대응한 공격은 -2/+0을 받는다.", 3, 1, 0, 10, 2, -1),
            new ActionCard(110, "쪽배에서 쉬노니", "더스트→오라：5【즉재기】[결사]-당신의 라이프가 3이하가 된다.", 2, 0),
            new AttackCard(111, "아마네 유리나의 저력", "【상시】[결사]-당신의 라이프가 3이하가 아니라면, 이 카드는 사용할 수 없다.", 5, 2, 1, 4, 5, 5)
        }));
        megamiList.add(new Megami(200, "사이네", "[팔상] - 당신의 오라가 1이하일 경우, 몇몇 카드가 강화된다.", new Card[]{
            new AttackCard(201, "팔방 휘두르기", "【공격후】[팔상]-당신의 오라가 1이하라면, 공격『적정거리4-5、2/1』을 행한다", -1, 0, 4, 5, 2, 1),
            new AttackCard(202, "후려베기", "-", -1, 1, 4, 5, 3, 1),
            new AttackCard(203, "무게추", "【공격후】[팔상]-당신의 오라가 1이하라면, 더스트→간격 : 1", -1, 1, 2, 3, 2, 1),
            new ActionCard(204, "간파", "【상시】[팔상]-당신의 오라가 1이하라면, 이 카드는 대응을 가진 것처럼 상대의 공격에 끼어들어 사용할 수 있다. 더스트⇔간격：1", -1, 0),
            new ContinuingCard(205, "권역", "【전개중】이 부여패 위의 벛꽃결정이 더스트로 이동하려 하면, 그것은 대신 간격으로 이동한다. 【전개중】달인의 간격이 1증가한다.", -1, 0, 2),
            new ContinuingCard(206, "충음정", "【전개시】대응한 공격은 -1/+0을 받는다. 【파기시】공격『적정거리0-10、1/-』을 수행하고 더스트→간격：1", -1, 1, 1),
            new ContinuingCard(207, "무음벽", "【전개중】당신이 받는 데미지를 해결할 때, 이 카드 위에 놓인 벛꽃 결정을 오라 위에 놓인 것처럼 사용할 수 있다.", -1, 2, 5),
            new ActionCard(208, "율동호극", "공격 『적정거리3-4、1/1』을 행한다. 공격 『적정거리4-5、1/1』을 행한다. 공격 『적정거리3-5、2/2』을 행한다.", 6, 0),
            new ActionCard(209, "향명공진", "【상시】이 카드의 소비는 상대의 오라 수 만큼 적어진다. 오라(상대)→간격 : 2", 8, 0),
            new AttackCard(210, "음무쇄빙", "【공격후】대응한 공격은 -1/-1을 받는다. 【재기】[팔상]-당신의 오라가 1이하이다.", 2, 1, 0, 10, 1, 1),
            new AttackCard(211, "히사메 사이네의 최후의 종극", "【상시】이 카드는 비장패에 대한 대응으로만 사용할 수 있다.", 5, 1, 1, 5, 5, 5)
        }));
        megamiList.add(new Megami(300, "히미카", "[연화] - 당신이 한 턴에 3장이상의 카드를 사용하였다면, 몇몇 카드가 강화된다.", new Card[]{
            new AttackCard(301, "슛", "-", -1, 0, 4, 10, 2, 1),
            new AttackCard(302, "래피드 파이어", "【상시】[연화]-이 카드를 포함해 이번턴에 3장 이상의 카드를 사용했다면, 이 공격은 +1/+1을 얻는다.", -1, 0, 6, 8, 2, 1),
            new AttackCard(303, "매그넘 캐논", "【공격후】라이프(자신)→더스트 : 1", -1, 0, 5, 8, 3, 2),
            new AttackCard(304, "풀 버스트", "【상시】이 공격이 데미지를 주는데 성공한다면, 상대는 한쪽을 고르는 대신 양쪽의 데미지를 받는다.", -1, 2, 3, 1, 3, 1),
            new ActionCard(305, "백스탭", "카드를 한 장 뽑는다. 더스트→간격：1", -1, 0),
            new ActionCard(306, "백드래프트", "상대를 위축시킨다. [연화]-이 카드를 포함하여 이번턴에 3장 이상의 카드를 사용했다면, 이번 턴 중 다음 다른 여신에 의한 오라 데미지가 [-]이 아닌 공격은 +1/+1을 얻는다.", -1, 0),
            new ContinuingCard(307, "스모크", "【전개중】카드의 화살표(→)에 의해 간격에 있는 벛꽃 결정이 이동하지 않는다.", -1, 0, 3),
            new AttackCard(308, "레드 불릿", "-", 0, 0, 5, 10, 3, 1),
            new AttackCard(309, "크림슨 제로", "【상시】이 공격이 데미지를 주는데 성공한다면, 상대는 한쪽을 고르는 대신 양쪽의 데미지를 받는다.【상시】현재의 간격이 0이라면 이 공격은 대응불가를 얻는다.", 5, 0, 0, 2, 2, 2),
            new ActionCard(310, "스칼렛 이매진", "카드를 2장 뽑는다. 그 후, 당신의 손패에서 카드를 한 장 덮음패로 만든다.", 3, 0),
            new ActionCard(311, "버밀리온 필드", "[연화]-이 카드를 포함해 이번 턴에 3장 이상의 카드를 사용했다면, 더스트→간격：2【재기】당신의 손패가 0장이다.", 2, 0)
        }));
        megamiList.add(new Megami(400, "토코요", "[경지] - 당신의 집중력이 2일 경우, 몇몇 카드가 강화된다.", new Card[]{
            new AttackCard(401, "빗어내리기", "【공격후】[경지]-당신의 집중력이 2라면, 이 카드를 덱 위로 되돌린다.", -1, 0, 4, 4, -1, 1),
            new AttackCard(402, "우아한 타격", "【공격후】[경지]-당신의 집중력이 2라면, 대응한 비장패가 아닌 공격을 무효로 한다.", -1, 1, 2, 4, 2, 1),
            new ActionCard(403, "날뛰는 토끼", "현재의 간격이 3 이하라면, 더스트→간격：2", -1, 0),
            new ActionCard(404, "시의 춤", "집중력을 1 얻고, 다음 중 하나를 선택한다. 플레어(자신)→오라(자신)：1, 오라(자신)→간격：1", -1, 1),
            new ActionCard(405, "부채 뒤집기", "버림패나 덮음패에서 카드를 최대 2장까지 선택한다. 이 카드들을 원하는 순서대로 패산 아래로 넣는다. 더스트→오라(자신)：2", -1, 2),
            new Card(406, "바람의 무대", "【전개시】간격→오라(자신)：2,【파기시】오라(자신)→간격：2", 2, 0),
            

        }));
    }
    
    public void saveFile() {
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File(PATH)));
            oos.writeObject(megamiList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos!=null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    public void loadFile() {
        File file = new File(PATH);
        if(!file.exists()) return;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));

            testList = (List<Megami>)ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(ois!=null) ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void printOut() {
        for (Megami megami : testList) {
            System.out.println(megami);
            for (Card card : megami.getCards()) {
                System.out.println(card);
            }
        }
    }
}
