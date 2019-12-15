
// Maven had to be manually installed on the box
// This DSL script relies on a particular plugin
mavenJob('DNF-API') { // Name of the Jenkins job
    jdk('java 8') // This had to be manually installed on the box
    scm {
        github('VargasRaymondJ/DNF2018-API')
    }
    triggers {
        githubPush()
    }
    goals('clean')
    goals('install')
}

// TODO: Create another job successfully with the Freeform job type 


