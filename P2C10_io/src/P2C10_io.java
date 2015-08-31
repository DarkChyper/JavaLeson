//Packages à importer afin d'utiliser l'objet File
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P2C10_io {
	public static void main(final String[] args) {
		// Nous déclarons nos objets en dehors du bloc try/catch
		FileInputStream fis;
		FileOutputStream fos;
		BufferedInputStream bis;
		BufferedOutputStream bos;

		try {
			fis = new FileInputStream(new File("test.txt"));
			fos = new FileOutputStream(new File("test2.txt"));
			bis = new BufferedInputStream(new FileInputStream(new File(
					"test.txt")));
			bos = new BufferedOutputStream(new FileOutputStream(new File(
					"test3.txt")));
			final byte[] buf = new byte[8];

			// On récupère le temps du système
			long startTime = System.currentTimeMillis();

			while (fis.read(buf) != -1) {
				fos.write(buf);
			}
			// On affiche le temps d'exécution
			System.out
					.println("Temps de lecture + écriture avec FileInputStream et FileOutputStream : "
							+ (System.currentTimeMillis() - startTime));

			// On réinitialise
			startTime = System.currentTimeMillis();

			while (bis.read(buf) != -1) {
				bos.write(buf);
			}
			// On réaffiche
			System.out
					.println("Temps de lecture + écriture avec BufferedInputStream et BufferedOutputStream : "
							+ (System.currentTimeMillis() - startTime));

			// On ferme nos flux de données
			fis.close();
			bis.close();

		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}