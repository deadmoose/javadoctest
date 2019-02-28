load("@google_bazel_common//tools/javadoc:javadoc.bzl", "javadoc_library")

javadoc_library(
    name = "javadoc",
    srcs = glob(["src/main/java/**/*.java"]),
    external_javadoc_links = [
        "https://google.github.io/truth/api/0.40/",
    ],
    root_packages = ["com.deadmoose"],
)
