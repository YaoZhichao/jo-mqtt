package joey.mqtt.broker.store.redis;

import joey.mqtt.broker.constant.BusinessConstants;
import joey.mqtt.broker.redis.RedisClient;
import joey.mqtt.broker.store.IDupPubRelMessageStore;

/**
 * redis pubRel消息存储
 *
 * @author Joey
 * @date 2019/9/7
 */
public class RedisDupPubRelMessageStore extends RedisDupBaseMessageStore implements IDupPubRelMessageStore {
    public RedisDupPubRelMessageStore(RedisClient redisClient) {
        super(redisClient);
    }

    @Override
    public String getRedisKey(String clientId) {
        return BusinessConstants.REDIS_MSG_DUP_PUB_REL_KEY_PRE + clientId;
    }
}
