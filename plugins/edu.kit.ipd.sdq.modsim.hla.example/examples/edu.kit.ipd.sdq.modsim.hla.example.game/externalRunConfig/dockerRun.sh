#!/bin/bash -l
#cd hla/
containerID="$(docker run -d -i fboehle/portico:2.0.2 /bin/bash)"
cd src
docker cp ./. "${containerID}":/portico/hla/
docker cp ../model/. "${containerID}":/portico/hla/model/
#docker attach "${containerID}"
docker exec -i "${containerID}" sh -c "cd hla && javac -cp /portico/lib/portico.jar hla/test/*.java && jar -cf java-hla.jar hla/test/*.class && java -cp ./java-hla.jar:/portico/lib/portico.jar hla.test.Main"
#docker exec -i "${containerID}" sh -c "cd hla && javac -cp /portico/lib/portico.jar hla/test/*.java"
#ls -al
