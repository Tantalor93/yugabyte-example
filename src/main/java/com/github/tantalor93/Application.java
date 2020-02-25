package com.github.tantalor93;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.CassandraInvalidQueryException;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.EntityWriteResult;
import org.springframework.data.cassandra.core.InsertOptions;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Session;

@SpringBootApplication

public class Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	@Autowired
	private CassandraOperations cassandraOperations;

	@Autowired
	private CassandraTemplate cassandraTemplate;

	@Autowired
	private BenkyRepository benkyRepository;

	@Autowired
	private Session session;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LOGGER.info("Starting...");

//			benkyRepository.insert(new UserDevicePeer(UUID.randomUUID(),
//					InetAddress.getByName("dddd:87b5:4c93:ecec:4a9e:9b65:4956:4e89"), substring, "b", "c"));

//		System.out.println(select);
		//		ExecutorService executorService = Executors.newFixedThreadPool(5);
//		for(int i = 0; i < 10000; i++) {
//			executorService.submit(() -> {
//						doInsert();
//					}
//			);
//		}
//
//		TimeUnit.SECONDS.sleep(15);
//
//		List<Sample> select = cassandraOperations.select("SELECT * FROM access.BENKY;", Sample.class);
//
//
//		System.out.println(select);
	}

	private String getIdentifier() {
		UUID uuid = UUID.randomUUID();
		;
		Long.toHexString(uuid.getLeastSignificantBits());
		String s = uuid.toString();
		String replace = s.replace("-", "");
		return replace.substring(0, 28);
	}
	//
//	private void doInsert() {
//		for (int i = 0; i < 20; i++) {
//			InsertOptions options = InsertOptions.builder().ifNotExists(true).build();
//
//			List<Sample> select = cassandraTemplate
//					.select("SELECT max(unq) as unq from access.BENKY", Sample.class);
//			int k = select.get(0).getUnq();
//			EntityWriteResult<Sample> insert = cassandraTemplate.insert(new Sample(k + i, k + i), options);
//			if (insert.wasApplied()) {
//				return;
//			}
//		}
//		LOGGER.error("FAILED");
//	}
}
