#!/bin/bash -l
#cd hla/
containerID="$(docker run -d -i portico_2.0.1 /bin/bash)"
docker cp ./. "${containerID}":/portico/hla/
docker cp ../model/. "${containerID}":/portico/hla/model/
#docker attach "${containerID}"
docker exec -i "${containerID}" sh -c "cd hla && javac -cp /portico/lib/portico.jar hla/test/*.java && jar -cf java-hla.jar hla/test/*.class && java -cp ./java-hla.jar:/portico/lib/portico.jar hla.test.Main"
#docker exec -i "${containerID}" sh -c "cd hla && javac -cp /portico/lib/portico.jar hla/test/*.java"
#ls -al
