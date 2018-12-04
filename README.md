# Hello OpenShift

Quickstart with OpenShift and Spring-Boot.

## Running application

```
mvn spring-boot:run
```

http://localhost:8080/hello

## Step 0: Installing Minishift 

https://docs.okd.io/latest/minishift/getting-started/installing.html

## Step 1: Starting Minishift 

```
minishift start
```

**OBS**: at the end of this step you are logged in as `developer` with the password: `developer`

## Step 2: Configure your Shell 

```
eval $(minishift oc-env)
```

## Step 3: Create a new Project 

```
oc new-project seariver
```

## Step 4: Add "view" role for current project 

```
oc policy add-role-to-user view system:serviceaccount:$(oc project -q):default -n $(oc project -q)
```

## OPTIONAL: Maven Version

### Checking for new dependency updates

```
mvn versions:display-dependency-updates
```

### Checking for new plugin updates

```
mvn versions:display-plugin-updates
```