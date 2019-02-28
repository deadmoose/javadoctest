load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "google_bazel_common",
    strip_prefix = "bazel-common-f1115e0f777f08c3cdb115526c4e663005bec69b",
    urls = ["https://github.com/google/bazel-common/archive/f1115e0f777f08c3cdb115526c4e663005bec69b.zip"],
)

#local_repository(
#    name = "google_bazel_common",
#    path = "../bazel-common",
#)

load("@google_bazel_common//:workspace_defs.bzl", "google_common_workspace_rules")

google_common_workspace_rules()
