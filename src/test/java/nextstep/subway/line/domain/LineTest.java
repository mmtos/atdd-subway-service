package nextstep.subway.line.domain;

import java.util.List;
import nextstep.subway.station.domain.Station;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LineTest {

    Line 이호선;
    Station 강변역 = new Station("강변역");
    Station 당산역 = new Station("당산역");

    @BeforeEach
    void setUp(){
        이호선 = new Line("이호선","초록색",강변역,당산역,100);
    }

    @Test
    void 노선에_속한_지하철역을_조회한다(){
        List<Station> stationList = 이호선.getStations();
        assertThat(stationList).hasSize(2).containsExactly(강변역,당산역);
    }
}
