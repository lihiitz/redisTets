package server;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("movementReport")
@Data
public class MovementReport implements Serializable {

    @Id
    private String trackId;

    private String trackReport;
}
