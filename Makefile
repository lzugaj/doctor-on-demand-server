build:
	gradle build

clean:
	gradle clean

test:
	gradle test

sonarqube:
	gradle sonar

docker-build-image:
	docker-compose build

docker-run-image:
	docker-compose up

docker-list-all-running-images:
	docker ps