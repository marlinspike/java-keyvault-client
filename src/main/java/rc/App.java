package rc;

import com.microsoft.*;
import com.microsoft.azure.keyvault.KeyVaultClient;
import com.microsoft.azure.keyvault.models.SecretBundle;
import com.microsoft.azure.keyvault.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String secretName = args.length > 0 ? args[0] : "hw";

        String clientId = "<Your App's Client-ID Here>";
        String clientKey = "<Your App's Client-Key Here>";

        String KEYVAULT_URL = "https://<vault-name>.vault.azure.net/";
        // ClientSecretKeyVaultCredential is the implementation of KeyVaultCredentials
        KeyVaultClient client = new KeyVaultClient(
                new ClientSecretKeyVaultCredential(clientId, clientKey));

        // KEYVAULT_URL is the location of the keyvault to use: https://yourkeyvault.vault.azure.net
        // "testSecret" is the name of the secret in the key vault
        SecretBundle secret = client.getSecret( KEYVAULT_URL, secretName );
        
        System.out.println("Getting Secret with Identifier: " + secretName);
        System.out.println("Got Secret: " + secret.value());
        System.exit(0);
    }
}
