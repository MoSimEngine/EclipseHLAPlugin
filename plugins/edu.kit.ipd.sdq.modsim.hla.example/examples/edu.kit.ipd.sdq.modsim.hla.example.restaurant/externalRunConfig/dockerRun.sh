#!/bin/bash -l
# Start up docker container and get its ID
containerID="$(docker run -d -i fboehle/portico:2.0.2 /bin/bash)"
# Copy Java files and HLA model into container
cd src
docker cp ./. "${containerID}":/portico/hla/
docker cp ../model/. "${containerID}":/portico/hla/model/
# Compile and execute Portico project with OpenJDK and Portico library from docker container
docker exec -i "${containerID}" sh -c "cd hla && javac -cp /portico/lib/portico.jar hla/test/*.java && jar -cf java-hla.jar hla/test/*.class && java -cp ./java-hla.jar:/portico/lib/portico.jar hla.test.Main"
