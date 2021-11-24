load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scala_binary (
    name = "BazelApp",
    srcs = glob(["scala/**/*.scala"]),
    main_class = "example.App",
    deps = [
      "@maven//:org_springframework_boot_spring_boot_starter_activemq",
      "@maven//:org_apache_commons_commons_text",
      "@maven//:com_google_code_gson_gson",
    ],
)
