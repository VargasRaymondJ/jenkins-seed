
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

// mavenJob('example') {
//     logRotator(-1, 10)
//     jdk('Java 8')
//     scm {
//         github('jenkinsci/jenkins', 'master')
//     }
//     triggers {
//         githubPush()
//     }
//     goals('clean verify')
// }
