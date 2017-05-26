package web.common;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import redis.clients.jedis.BinaryClient.LIST_POSITION;
import redis.clients.jedis.BitPosParams;
import redis.clients.jedis.GeoCoordinate;
import redis.clients.jedis.GeoRadiusResponse;
import redis.clients.jedis.GeoUnit;
import redis.clients.jedis.JedisCommands;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;
import redis.clients.jedis.SortingParams;
import redis.clients.jedis.Tuple;
import redis.clients.jedis.params.geo.GeoRadiusParam;
import redis.clients.jedis.params.sortedset.ZAddParams;
import redis.clients.jedis.params.sortedset.ZIncrByParams;

@Service("redisClient")
public class RedisClient implements JedisCommands {

    private JedisPool jedisPool;

    @Value("${redis.host}")
    private String host;
    @Value("${redis.password}")
    private String password;
    @Value("${redis.port}")
    private String port;
    @Value("${redis.timeout}")
    private String timeout;
    @Value("${redis.minSize}")
    private String minSize;
    @Value("${redis.maxSize}")
    private String maxSize;
    
    @PostConstruct
    private void init() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMinIdle(Integer.valueOf(minSize));
        config.setMaxTotal(Integer.valueOf(maxSize));
        if (StringUtils.isEmpty(password)) {
            jedisPool = new JedisPool(config, host, Integer.valueOf(port), Integer.valueOf(timeout));
        } else {
            jedisPool = new JedisPool(config, host, Integer.valueOf(port), Integer.valueOf(timeout), password);
        }
    }
    
	public String set(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String set(String paramString1, String paramString2, String paramString3, String paramString4,
			long paramLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public String set(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public String get(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean exists(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long persist(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public String type(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long expire(String paramString, int paramInt) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long pexpire(String paramString, long paramLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long expireAt(String paramString, long paramLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long pexpireAt(String paramString, long paramLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long ttl(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long pttl(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean setbit(String paramString, long paramLong, boolean paramBoolean) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean setbit(String paramString1, long paramLong, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean getbit(String paramString, long paramLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long setrange(String paramString1, long paramLong, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getrange(String paramString, long paramLong1, long paramLong2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSet(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long setnx(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String setex(String paramString1, int paramInt, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String psetex(String paramString1, long paramLong, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long decrBy(String paramString, long paramLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long decr(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long incrBy(String paramString, long paramLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double incrByFloat(String paramString, double paramDouble) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long incr(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long append(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String substr(String paramString, int paramInt1, int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long hset(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public String hget(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long hsetnx(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public String hmset(String paramString, Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> hmget(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long hincrBy(String paramString1, String paramString2, long paramLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double hincrByFloat(String paramString1, String paramString2, double paramDouble) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean hexists(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long hdel(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long hlen(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> hkeys(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> hvals(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, String> hgetAll(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long rpush(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long lpush(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long llen(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> lrange(String paramString, long paramLong1, long paramLong2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String ltrim(String paramString, long paramLong1, long paramLong2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String lindex(String paramString, long paramLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public String lset(String paramString1, long paramLong, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long lrem(String paramString1, long paramLong, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String lpop(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public String rpop(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long sadd(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> smembers(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long srem(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public String spop(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> spop(String paramString, long paramLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long scard(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean sismember(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String srandmember(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> srandmember(String paramString, int paramInt) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long strlen(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zadd(String paramString1, double paramDouble, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zadd(String paramString1, double paramDouble, String paramString2, ZAddParams paramZAddParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zadd(String paramString, Map<String, Double> paramMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zadd(String paramString, Map<String, Double> paramMap, ZAddParams paramZAddParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrange(String paramString, long paramLong1, long paramLong2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zrem(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double zincrby(String paramString1, double paramDouble, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double zincrby(String paramString1, double paramDouble, String paramString2,
			ZIncrByParams paramZIncrByParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zrank(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zrevrank(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrevrange(String paramString, long paramLong1, long paramLong2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Tuple> zrangeWithScores(String paramString, long paramLong1, long paramLong2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Tuple> zrevrangeWithScores(String paramString, long paramLong1, long paramLong2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zcard(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double zscore(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> sort(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> sort(String paramString, SortingParams paramSortingParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zcount(String paramString, double paramDouble1, double paramDouble2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zcount(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrangeByScore(String paramString, double paramDouble1, double paramDouble2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrangeByScore(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrevrangeByScore(String paramString, double paramDouble1, double paramDouble2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrangeByScore(String paramString, double paramDouble1, double paramDouble2, int paramInt1,
			int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrevrangeByScore(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrangeByScore(String paramString1, String paramString2, String paramString3, int paramInt1,
			int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrevrangeByScore(String paramString, double paramDouble1, double paramDouble2, int paramInt1,
			int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Tuple> zrangeByScoreWithScores(String paramString, double paramDouble1, double paramDouble2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Tuple> zrevrangeByScoreWithScores(String paramString, double paramDouble1, double paramDouble2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Tuple> zrangeByScoreWithScores(String paramString, double paramDouble1, double paramDouble2,
			int paramInt1, int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrevrangeByScore(String paramString1, String paramString2, String paramString3, int paramInt1,
			int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Tuple> zrangeByScoreWithScores(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Tuple> zrevrangeByScoreWithScores(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Tuple> zrangeByScoreWithScores(String paramString1, String paramString2, String paramString3,
			int paramInt1, int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Tuple> zrevrangeByScoreWithScores(String paramString, double paramDouble1, double paramDouble2,
			int paramInt1, int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Tuple> zrevrangeByScoreWithScores(String paramString1, String paramString2, String paramString3,
			int paramInt1, int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zremrangeByRank(String paramString, long paramLong1, long paramLong2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zremrangeByScore(String paramString, double paramDouble1, double paramDouble2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zremrangeByScore(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zlexcount(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrangeByLex(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrangeByLex(String paramString1, String paramString2, String paramString3, int paramInt1,
			int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrevrangeByLex(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> zrevrangeByLex(String paramString1, String paramString2, String paramString3, int paramInt1,
			int paramInt2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long zremrangeByLex(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long linsert(String paramString1, LIST_POSITION paramLIST_POSITION, String paramString2,
			String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long lpushx(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long rpushx(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> blpop(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> blpop(int paramInt, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> brpop(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> brpop(int paramInt, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long del(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public String echo(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long move(String paramString, int paramInt) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long bitcount(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long bitcount(String paramString, long paramLong1, long paramLong2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long bitpos(String paramString, boolean paramBoolean) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long bitpos(String paramString, boolean paramBoolean, BitPosParams paramBitPosParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public ScanResult<Entry<String, String>> hscan(String paramString, int paramInt) {
		// TODO Auto-generated method stub
		return null;
	}

	public ScanResult<String> sscan(String paramString, int paramInt) {
		// TODO Auto-generated method stub
		return null;
	}

	public ScanResult<Tuple> zscan(String paramString, int paramInt) {
		// TODO Auto-generated method stub
		return null;
	}

	public ScanResult<Entry<String, String>> hscan(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public ScanResult<Entry<String, String>> hscan(String paramString1, String paramString2,
			ScanParams paramScanParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public ScanResult<String> sscan(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public ScanResult<String> sscan(String paramString1, String paramString2, ScanParams paramScanParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public ScanResult<Tuple> zscan(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public ScanResult<Tuple> zscan(String paramString1, String paramString2, ScanParams paramScanParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long pfadd(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public long pfcount(String paramString) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Long geoadd(String paramString1, double paramDouble1, double paramDouble2, String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long geoadd(String paramString, Map<String, GeoCoordinate> paramMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double geodist(String paramString1, String paramString2, String paramString3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double geodist(String paramString1, String paramString2, String paramString3, GeoUnit paramGeoUnit) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> geohash(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<GeoCoordinate> geopos(String paramString, String... paramArrayOfString) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<GeoRadiusResponse> georadius(String paramString, double paramDouble1, double paramDouble2,
			double paramDouble3, GeoUnit paramGeoUnit) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<GeoRadiusResponse> georadius(String paramString, double paramDouble1, double paramDouble2,
			double paramDouble3, GeoUnit paramGeoUnit, GeoRadiusParam paramGeoRadiusParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<GeoRadiusResponse> georadiusByMember(String paramString1, String paramString2, double paramDouble,
			GeoUnit paramGeoUnit) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<GeoRadiusResponse> georadiusByMember(String paramString1, String paramString2, double paramDouble,
			GeoUnit paramGeoUnit, GeoRadiusParam paramGeoRadiusParam) {
		// TODO Auto-generated method stub
		return null;
	}

 
}

