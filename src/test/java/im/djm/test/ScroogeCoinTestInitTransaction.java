package im.djm.test;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Before;
import org.junit.Test;

public class ScroogeCoinTestInitTransaction {

	private KeyPairGenerator keyGenerator;
	private SecureRandom random;

	// Scrooge keys
	private KeyPair scrooge;
	private PrivateKey scroogeSecKey;
	private PublicKey scroogePubKey;

	@Before
	public void init() throws NoSuchAlgorithmException, NoSuchProviderException {
		Security.addProvider(new BouncyCastleProvider());

		this.keyGenerator = KeyPairGenerator.getInstance("RSA");
		this.random = SecureRandom.getInstance("SHA1PRNG", "SUN");
		this.keyGenerator.initialize(1024, this.random);

		this.scrooge = this.keyGenerator.generateKeyPair();
		this.scroogeSecKey = this.scrooge.getPrivate();
		this.scroogePubKey = this.scrooge.getPublic();
	}

	@Test
	public void test01() {
	}

}
