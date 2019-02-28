load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

gen_java_tests(
    name = "foo_tests",
    srcs = glob(["*.java"]),
    deps = [
        "//src/main/java/com/deadmoose/foo",
        "@google_bazel_common//third_party/java/guava",
        "@google_bazel_common//third_party/java/junit",
        "@google_bazel_common//third_party/java/truth",
    ],
)
