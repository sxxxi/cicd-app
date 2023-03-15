#!/bin/sh

# Next time, use the id's returned by docker to stop and remove images and containers

image=$1
container=$2

# Check if container exists. Remove if so
echo 'Checking contaner presence'
container_presence=$(docker container ls | grep $container | awk '{ print $NF }')
echo $container_presence
echo $container
if [ $container_presence = $container ] 
then
	echo 'Container exists'
	docker container stop $container
	docker container rm $container
fi

# Check if image exists first before building
echo 'Checking image presence...'
image_presence=$(docker image ls | grep $image | awk '{print $1}')
if [ $image_presence = $image ]
then
	echo 'Image exists'
	docker image rm $image
fi

#build
docker build -t $image .

#deploy
docker run -dp 8081:8080 --name $container $image

