# java-keyvault-client
Read secrets from KeyVault using the Java SDK

Usage:
STEP 1
1. Register an Application in Azure Active Directory, and note the Applications "Application ID"
2. Add a Key for the application (Settings->Keys), and note it's value -- this will only be visible once you save the key.

STEP 2
1. Go to your Keyvault and note its DNS Name
2. Add an Access Policy for your Application to KeyVault (Access Policies -> Add New -> Select the Application you created in STEP 1
3. Ensure that "Secret Management" is one of the permissions provided

STEP 3
1. Modify the code in App.java, providing the following input:
  - ClientID: (Application ID from STEP 1)
  - clientKey: (Key from STEP 1)
  - KEYVAULT_URL: (DNS Name from STEP 2)
 
Run the app:
- Pass the name of a Secert in to the app using arguments

(From Maven): mvn exec:java -Dexec.mainClass="rc.App"  -Dexec.args="MySecret"

