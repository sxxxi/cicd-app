import json
import subprocess 
import sys
from threading import Thread
from multiprocessing import Pool

network_name = sys.argv[1]

# inspect docker network
network_inspect = subprocess.check_output(["docker", "network", "inspect", network_name])

# JSONify inspect and get connected containers' keys
net_json = json.loads(network_inspect.decode('UTF-8'))[0]["Containers"].keys()

#foo = subprocess.run(["docker", "network", "inspect", network_name], stdout=subprocess.PIPE) 
#print(foo.stdout.decode('UTF-8'))

def task(id):
    print("Stopping and removeing container [%s]" % id)
    subprocess.run(["docker", "container", "stop", id])
    subprocess.run(["docker", "container", "rm", id])

up_cont = len(net_json)

if (up_cont <= 0):
    exit()

if __name__ == '__main__':
    with Pool(up_cont) as p:
        p.map(task, net_json)

