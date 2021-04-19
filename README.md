# ConfigWatcher

A demo service that utilizes Spring-Cloud-Kubernets-CloudWatcher to get auto updates on Config Map Changes. Config Watcher run in parallel to the demo service and publishes the change event to the services when ever one is detected
Kubernetes resource ConfigMap is utilized in this demo however the same rules applies to Secret as well.

 
