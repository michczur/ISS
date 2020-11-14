package database.dao;

import model.entity.StationPosition;
import java.sql.Timestamp;
import java.util.List;

public interface StationPositionDao {
        void save(StationPosition position);
        StationPosition checkPositionBytime(Timestamp timestamp);
        List<StationPosition> movePath();
        void deleteByTime(Timestamp timestamp);

}
